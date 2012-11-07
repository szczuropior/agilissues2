
function hideLinksAddingNewElements() {
    $('.AddNewElementLink').hide();
}

function addSortableBehaviourToPBItems() {
    $('.PBItemsContainer').sortable({
        handle: '.PB_Item_Descr',
        axis: 'y',
        forcePlaceholderSize: true,
        placeholder: '.PBItemListElement',
        tolerance: 'intersect'
    });
}

function handleItemDataValueChange(type, value, newEltLinkId) {
    var resourcePath = createItemDataElementResourcePath(type, value);
    $.get(resourcePath, function(exists) {
        setVisibilityOfHtmlElement(newEltLinkId, !exists)
    });
    }

function createItemDataElementResourcePath(type, value) {return '/' + type + '/' + value + '/exists';}

function setVisibilityOfHtmlElement(elementId, visible) {
    if (visible) $('#' + elementId).show(); else $('#' + elementId).hide();
}