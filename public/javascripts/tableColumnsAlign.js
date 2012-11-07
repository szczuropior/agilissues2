/** Aligns all rows in all tables annotated by class className. <br/>
 Script results in setting all tables columns under given index equal width. */
function alignColumnsInTables(className) {
   var cl = $(className);
   var sizes = getListOfTdWidthMaxes(cl);
   setColumnSizes(cl, sizes)
}

function setColumnSizes(clazz, sizes) {
   clazz.each(function() {  
      var tds = $(this).find("td");
      for(var i=0; i<sizes.length; i++){
         $(tds[i]).width(sizes[i]);
      }
   });
}

function getListOfTdWidthMaxes(rows) {
   var retList = new Array($(rows).size());
   for(var i=0; i<retList.length; i++){
      var tds = $(rows[i]).find("td");
      retList[i] = $(tds).map(function() {
         return $(this).width();
         //return $(this).innerWidth();
      });
   }
   return getListOfMaxes(retList);
}

function getListOfMaxes(lists) {
   return lists.reduce(function(a,b){
      return getMax(a,b)
   });
}

function getMax(list1, list2) {
   var maxList = new Array(list2.length);
   for(var i=0; i<list2.length; i++){
      maxList[i] = Math.max(list1[i], list2[i]);
   }
   return maxList;
}
