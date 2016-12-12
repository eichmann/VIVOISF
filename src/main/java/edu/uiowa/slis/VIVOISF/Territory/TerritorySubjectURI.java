package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritorySubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritorySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritorySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Territory theTerritory = (Territory)findAncestorWithClass(this, Territory.class);
			if (!theTerritory.commitNeeded) {
				pageContext.getOut().print(theTerritory.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Territory theTerritory = (Territory)findAncestorWithClass(this, Territory.class);
			return theTerritory.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Territory for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Territory theTerritory = (Territory)findAncestorWithClass(this, Territory.class);
			theTerritory.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for subjectURI tag ");
		}
	}
}

