package edu.uiowa.slis.VIVOISF.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Resource extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Resource currentInstance = null;
	private static final Log log = LogFactory.getLog(Resource.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ResourceIterator theResourceIterator = (ResourceIterator) findAncestorWithClass(this, ResourceIterator.class);

			if (theResourceIterator != null) {
				subjectURI = theResourceIterator.getSubjectURI();
				label = theResourceIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Resource.ResourceAnnotatedSourceIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Resource.ResourceAnnotatedSourceIterator)this.getParent()).getAnnotatedSource();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Statement.StatementObjectIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Statement.StatementObjectIterator)this.getParent()).getObject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Statement.StatementSubjectIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Statement.StatementSubjectIterator)this.getParent()).getSubject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.List.ListFirstIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.List.ListFirstIterator)this.getParent()).getFirst();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Resource.ResourceIsDefinedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Resource.ResourceIsDefinedByIterator)this.getParent()).getIsDefinedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Resource.ResourceSeeAlsoIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Resource.ResourceSeeAlsoIterator)this.getParent()).getSeeAlso();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Restriction.RestrictionHasSelfIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Restriction.RestrictionHasSelfIterator)this.getParent()).getHasSelf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Resource.ResourceMemberIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Resource.ResourceMemberIterator)this.getParent()).getMember();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Restriction.RestrictionHasValueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Restriction.RestrictionHasValueIterator)this.getParent()).getHasValue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Resource.ResourceAnnotatedTargetIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Resource.ResourceAnnotatedTargetIterator)this.getParent()).getAnnotatedTarget();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Resource.ResourceValueIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Resource.ResourceValueIterator)this.getParent()).getValue();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Resource.ResourceAnnotatedPropertyIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Resource.ResourceAnnotatedPropertyIterator)this.getParent()).getAnnotatedProperty();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Statement.StatementPredicateIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Statement.StatementPredicateIterator)this.getParent()).getPredicate();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Note.NoteAnnotatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Note.NoteAnnotatesIterator)this.getParent()).getAnnotates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentTranscriptOfIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentTranscriptOfIterator)this.getParent()).getTranscriptOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentReviewOfIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentReviewOfIterator)this.getParent()).getReviewOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Resource.ResourceDeprecatedIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Resource.ResourceDeprecatedIterator)this.getParent()).getDeprecated();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Resource.ResourceVersionInfoIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Resource.ResourceVersionInfoIterator)this.getParent()).getVersionInfo();
			}

			edu.uiowa.slis.VIVOISF.Resource.ResourceAnnotatedSourceIterator theResourceAnnotatedSourceIterator = (edu.uiowa.slis.VIVOISF.Resource.ResourceAnnotatedSourceIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Resource.ResourceAnnotatedSourceIterator.class);

			if (subjectURI == null && theResourceAnnotatedSourceIterator != null) {
				subjectURI = theResourceAnnotatedSourceIterator.getAnnotatedSource();
			}

			edu.uiowa.slis.VIVOISF.Statement.StatementObjectIterator theStatementObjectIterator = (edu.uiowa.slis.VIVOISF.Statement.StatementObjectIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Statement.StatementObjectIterator.class);

			if (subjectURI == null && theStatementObjectIterator != null) {
				subjectURI = theStatementObjectIterator.getObject();
			}

			edu.uiowa.slis.VIVOISF.Statement.StatementSubjectIterator theStatementSubjectIterator = (edu.uiowa.slis.VIVOISF.Statement.StatementSubjectIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Statement.StatementSubjectIterator.class);

			if (subjectURI == null && theStatementSubjectIterator != null) {
				subjectURI = theStatementSubjectIterator.getSubject();
			}

			edu.uiowa.slis.VIVOISF.List.ListFirstIterator theListFirstIterator = (edu.uiowa.slis.VIVOISF.List.ListFirstIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.List.ListFirstIterator.class);

			if (subjectURI == null && theListFirstIterator != null) {
				subjectURI = theListFirstIterator.getFirst();
			}

			edu.uiowa.slis.VIVOISF.Resource.ResourceIsDefinedByIterator theResourceIsDefinedByIterator = (edu.uiowa.slis.VIVOISF.Resource.ResourceIsDefinedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Resource.ResourceIsDefinedByIterator.class);

			if (subjectURI == null && theResourceIsDefinedByIterator != null) {
				subjectURI = theResourceIsDefinedByIterator.getIsDefinedBy();
			}

			edu.uiowa.slis.VIVOISF.Resource.ResourceSeeAlsoIterator theResourceSeeAlsoIterator = (edu.uiowa.slis.VIVOISF.Resource.ResourceSeeAlsoIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Resource.ResourceSeeAlsoIterator.class);

			if (subjectURI == null && theResourceSeeAlsoIterator != null) {
				subjectURI = theResourceSeeAlsoIterator.getSeeAlso();
			}

			edu.uiowa.slis.VIVOISF.Restriction.RestrictionHasSelfIterator theRestrictionHasSelfIterator = (edu.uiowa.slis.VIVOISF.Restriction.RestrictionHasSelfIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Restriction.RestrictionHasSelfIterator.class);

			if (subjectURI == null && theRestrictionHasSelfIterator != null) {
				subjectURI = theRestrictionHasSelfIterator.getHasSelf();
			}

			edu.uiowa.slis.VIVOISF.Resource.ResourceMemberIterator theResourceMemberIterator = (edu.uiowa.slis.VIVOISF.Resource.ResourceMemberIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Resource.ResourceMemberIterator.class);

			if (subjectURI == null && theResourceMemberIterator != null) {
				subjectURI = theResourceMemberIterator.getMember();
			}

			edu.uiowa.slis.VIVOISF.Restriction.RestrictionHasValueIterator theRestrictionHasValueIterator = (edu.uiowa.slis.VIVOISF.Restriction.RestrictionHasValueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Restriction.RestrictionHasValueIterator.class);

			if (subjectURI == null && theRestrictionHasValueIterator != null) {
				subjectURI = theRestrictionHasValueIterator.getHasValue();
			}

			edu.uiowa.slis.VIVOISF.Resource.ResourceAnnotatedTargetIterator theResourceAnnotatedTargetIterator = (edu.uiowa.slis.VIVOISF.Resource.ResourceAnnotatedTargetIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Resource.ResourceAnnotatedTargetIterator.class);

			if (subjectURI == null && theResourceAnnotatedTargetIterator != null) {
				subjectURI = theResourceAnnotatedTargetIterator.getAnnotatedTarget();
			}

			edu.uiowa.slis.VIVOISF.Resource.ResourceValueIterator theResourceValueIterator = (edu.uiowa.slis.VIVOISF.Resource.ResourceValueIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Resource.ResourceValueIterator.class);

			if (subjectURI == null && theResourceValueIterator != null) {
				subjectURI = theResourceValueIterator.getValue();
			}

			edu.uiowa.slis.VIVOISF.Resource.ResourceAnnotatedPropertyIterator theResourceAnnotatedPropertyIterator = (edu.uiowa.slis.VIVOISF.Resource.ResourceAnnotatedPropertyIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Resource.ResourceAnnotatedPropertyIterator.class);

			if (subjectURI == null && theResourceAnnotatedPropertyIterator != null) {
				subjectURI = theResourceAnnotatedPropertyIterator.getAnnotatedProperty();
			}

			edu.uiowa.slis.VIVOISF.Statement.StatementPredicateIterator theStatementPredicateIterator = (edu.uiowa.slis.VIVOISF.Statement.StatementPredicateIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Statement.StatementPredicateIterator.class);

			if (subjectURI == null && theStatementPredicateIterator != null) {
				subjectURI = theStatementPredicateIterator.getPredicate();
			}

			edu.uiowa.slis.VIVOISF.Note.NoteAnnotatesIterator theNoteAnnotatesIterator = (edu.uiowa.slis.VIVOISF.Note.NoteAnnotatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Note.NoteAnnotatesIterator.class);

			if (subjectURI == null && theNoteAnnotatesIterator != null) {
				subjectURI = theNoteAnnotatesIterator.getAnnotates();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentTranscriptOfIterator theDocumentTranscriptOfIterator = (edu.uiowa.slis.VIVOISF.Document.DocumentTranscriptOfIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentTranscriptOfIterator.class);

			if (subjectURI == null && theDocumentTranscriptOfIterator != null) {
				subjectURI = theDocumentTranscriptOfIterator.getTranscriptOf();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentReviewOfIterator theDocumentReviewOfIterator = (edu.uiowa.slis.VIVOISF.Document.DocumentReviewOfIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentReviewOfIterator.class);

			if (subjectURI == null && theDocumentReviewOfIterator != null) {
				subjectURI = theDocumentReviewOfIterator.getReviewOf();
			}

			edu.uiowa.slis.VIVOISF.Resource.ResourceDeprecatedIterator theResourceDeprecatedIterator = (edu.uiowa.slis.VIVOISF.Resource.ResourceDeprecatedIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Resource.ResourceDeprecatedIterator.class);

			if (subjectURI == null && theResourceDeprecatedIterator != null) {
				subjectURI = theResourceDeprecatedIterator.getDeprecated();
			}

			edu.uiowa.slis.VIVOISF.Resource.ResourceVersionInfoIterator theResourceVersionInfoIterator = (edu.uiowa.slis.VIVOISF.Resource.ResourceVersionInfoIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Resource.ResourceVersionInfoIterator.class);

			if (subjectURI == null && theResourceVersionInfoIterator != null) {
				subjectURI = theResourceVersionInfoIterator.getVersionInfo();
			}

			if (theResourceIterator == null && subjectURI == null) {
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
			log.error("Exception raised in Resource doStartTag", e);
			throw new JspTagException("Exception raised in Resource doStartTag");
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
			log.error("Exception raised in Resource doEndTag", e);
			throw new JspTagException("Exception raised in Resource doEndTag");
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
