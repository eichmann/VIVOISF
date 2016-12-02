package edu.uiowa.slis.VIVOISF.Grant;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Grant extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Grant currentInstance = null;
	private static final Log log = LogFactory.getLog(Grant.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String sponsorAwardId = null;
	String grantDirectCosts = null;
	String totalAwardAmount = null;
	String RO_0000052 = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			GrantIterator theGrantIterator = (GrantIterator) findAncestorWithClass(this, GrantIterator.class);

			if (theGrantIterator != null) {
				subjectURI = theGrantIterator.getSubjectURI();
				label = theGrantIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Organization.OrganizationSubcontractsGrantIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Organization.OrganizationSubcontractsGrantIterator)this.getParent()).getSubcontractsGrant();
			}

			edu.uiowa.slis.VIVOISF.Organization.OrganizationSubcontractsGrantIterator theOrganizationSubcontractsGrantIterator = (edu.uiowa.slis.VIVOISF.Organization.OrganizationSubcontractsGrantIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Organization.OrganizationSubcontractsGrantIterator.class);

			if (subjectURI == null && theOrganizationSubcontractsGrantIterator != null) {
				subjectURI = theOrganizationSubcontractsGrantIterator.getSubcontractsGrant();
			}

			if (theGrantIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?labelUS ?labelENG ?label ?labelANY ?foafName ?schemaName ?rdfValue  ?sponsorAwardId ?grantDirectCosts ?totalAwardAmount ?RO_0000052 where {"
				+ "  OPTIONAL { SELECT ?labelUS  WHERE { <" + subjectURI + "> rdfs:label ?labelUS  FILTER (lang(?labelUS) = \"en-US\")}    LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelENG WHERE { <" + subjectURI + "> rdfs:label ?labelENG FILTER (langMatches(?labelENG,\"en\"))} LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?label    WHERE { <" + subjectURI + "> rdfs:label ?label    FILTER (lang(?label) = \"\")}           LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelANY WHERE { <" + subjectURI + "> rdfs:label ?labelANY FILTER (lang(?labelANY) != \"\")}       LIMIT 1 } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#sponsorAwardId> ?sponsorAwardId } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#grantDirectCosts> ?grantDirectCosts } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#totalAwardAmount> ?totalAwardAmount } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://purl.obolibrary.org/obo/RO_0000052> ?RO_0000052 } "
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
					sponsorAwardId = sol.get("?sponsorAwardId") == null ? null : sol.get("?sponsorAwardId").toString();
					grantDirectCosts = sol.get("?grantDirectCosts") == null ? null : sol.get("?grantDirectCosts").toString();
					totalAwardAmount = sol.get("?totalAwardAmount") == null ? null : sol.get("?totalAwardAmount").toString();
					RO_0000052 = sol.get("?RO_0000052") == null ? null : sol.get("?RO_0000052").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Grant doStartTag", e);
			throw new JspTagException("Exception raised in Grant doStartTag");
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
			log.error("Exception raised in Grant doEndTag", e);
			throw new JspTagException("Exception raised in Grant doEndTag");
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

	public void setSponsorAwardId(String sponsorAwardId) {
		this.sponsorAwardId = sponsorAwardId;
	}

	public String getSponsorAwardId() {
		return sponsorAwardId;
	}

	public void setGrantDirectCosts(String grantDirectCosts) {
		this.grantDirectCosts = grantDirectCosts;
	}

	public String getGrantDirectCosts() {
		return grantDirectCosts;
	}

	public void setTotalAwardAmount(String totalAwardAmount) {
		this.totalAwardAmount = totalAwardAmount;
	}

	public String getTotalAwardAmount() {
		return totalAwardAmount;
	}

	public void setRO_0000052(String RO_0000052) {
		this.RO_0000052 = RO_0000052;
	}

	public String getRO_0000052() {
		return RO_0000052;
	}

}
