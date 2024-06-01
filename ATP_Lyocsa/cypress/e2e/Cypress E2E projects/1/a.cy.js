///<reference types="cypress"/>
describe("ulohaA", () => {
    before("Navstiv url adresu a vyber 'a' elementy", () => {
        cy.visit("https://sortablejs.github.io/Sortable/#cloning")
        cy.viewport(1400, 1200)
    })
    
    const frameworks = [
        "Vue.Draggable",
        "react-sortablejs",
        "ngx-sortablejs",
        "jquery-sortablejs",
        "knockout-sortablejs",
        "meteor-sortablejs",
        "polymer-sortablejs",
        "ember-sortablejs"
    ];

    frameworks.forEach(framework => {
        it(`Find and click ${framework}`, () => {
            cy.get("a").contains(framework).click()
            cy.get(".row.frameworks").contains(framework)
        })
    });
})