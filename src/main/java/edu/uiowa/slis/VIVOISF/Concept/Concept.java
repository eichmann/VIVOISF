package edu.uiowa.slis.VIVOISF.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Concept extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Concept currentInstance = null;
	private static final Log log = LogFactory.getLog(Concept.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ConceptIterator theConceptIterator = (ConceptIterator) findAncestorWithClass(this, ConceptIterator.class);

			if (theConceptIterator != null) {
				subjectURI = theConceptIterator.getSubjectURI();
				label = theConceptIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Concept.ConceptRelatedIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Concept.ConceptRelatedIterator)this.getParent()).getRelated();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Concept.ConceptNarrowerIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Concept.ConceptNarrowerIterator)this.getParent()).getNarrower();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Concept.ConceptSemanticRelationIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Concept.ConceptSemanticRelationIterator)this.getParent()).getSemanticRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Concept.ConceptBroaderIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Concept.ConceptBroaderIterator)this.getParent()).getBroader();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ConceptScheme.ConceptSchemeHasTopConceptIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ConceptScheme.ConceptSchemeHasTopConceptIterator)this.getParent()).getHasTopConcept();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Collection.CollectionMemberIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Collection.CollectionMemberIterator)this.getParent()).getMember();
			}

			edu.uiowa.slis.VIVOISF.Concept.ConceptRelatedIterator theConceptRelatedIterator = (edu.uiowa.slis.VIVOISF.Concept.ConceptRelatedIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Concept.ConceptRelatedIterator.class);

			if (subjectURI == null && theConceptRelatedIterator != null) {
				subjectURI = theConceptRelatedIterator.getRelated();
			}

			edu.uiowa.slis.VIVOISF.Concept.ConceptNarrowerIterator theConceptNarrowerIterator = (edu.uiowa.slis.VIVOISF.Concept.ConceptNarrowerIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Concept.ConceptNarrowerIterator.class);

			if (subjectURI == null && theConceptNarrowerIterator != null) {
				subjectURI = theConceptNarrowerIterator.getNarrower();
			}

			edu.uiowa.slis.VIVOISF.Concept.ConceptSemanticRelationIterator theConceptSemanticRelationIterator = (edu.uiowa.slis.VIVOISF.Concept.ConceptSemanticRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Concept.ConceptSemanticRelationIterator.class);

			if (subjectURI == null && theConceptSemanticRelationIterator != null) {
				subjectURI = theConceptSemanticRelationIterator.getSemanticRelation();
			}

			edu.uiowa.slis.VIVOISF.Concept.ConceptBroaderIterator theConceptBroaderIterator = (edu.uiowa.slis.VIVOISF.Concept.ConceptBroaderIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Concept.ConceptBroaderIterator.class);

			if (subjectURI == null && theConceptBroaderIterator != null) {
				subjectURI = theConceptBroaderIterator.getBroader();
			}

			edu.uiowa.slis.VIVOISF.ConceptScheme.ConceptSchemeHasTopConceptIterator theConceptSchemeHasTopConceptIterator = (edu.uiowa.slis.VIVOISF.ConceptScheme.ConceptSchemeHasTopConceptIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ConceptScheme.ConceptSchemeHasTopConceptIterator.class);

			if (subjectURI == null && theConceptSchemeHasTopConceptIterator != null) {
				subjectURI = theConceptSchemeHasTopConceptIterator.getHasTopConcept();
			}

			edu.uiowa.slis.VIVOISF.Collection.CollectionMemberIterator theCollectionMemberIterator = (edu.uiowa.slis.VIVOISF.Collection.CollectionMemberIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Collection.CollectionMemberIterator.class);

			if (subjectURI == null && theCollectionMemberIterator != null) {
				subjectURI = theCollectionMemberIterator.getMember();
			}

			if (theConceptIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?labelUS ?labelENG ?label ?labelANY ?foafName ?schemaName ?rdfValue  where {"
				+ "  OPTIONAL { SELECT ?labelUS  WHERE { <" + subjectURI + "> rdfs:label ?labelUS  FILTER (lang(?labelUS) = \"en-US\")}    LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelENG WHERE { <" + subjectURI + "> rdfs:label ?labelENG FILTER (langMatches(?labelENG,\"en\"))} LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?label    WHERE { <" + subjectURI + "> rdfs:label ?label    FILTER (lang(?label) = \"\")}           LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelANY WHERE { <" + subjectURI + "> rdfs:label ?labelANY FILTER (lang(?labelANY) != \"\")}       LIMIT 1 } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?labelUS") == null ? null : sol.get("?labelUS").asLiteral().getString();
					if (label == null)
						label = sol.get("?labelENG") == null ? null : sol.get("?labelENG").asLiteral().getString();
					if (label == null)
						label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?labelANY") == null ? null : sol.get("?labelANY").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?schemaName") == null ? null : sol.get("?schemaName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Concept doStartTag", e);
			throw new JspTagException("Exception raised in Concept doStartTag");
		} finally {
			freeConnection();
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Concept doEndTag", e);
			throw new JspTagException("Exception raised in Concept doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSubjectURI(String subjectURI) {
		this.subjectURI = subjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
