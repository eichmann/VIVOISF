package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Continent theContinent = (Continent)findAncestorWithClass(this, Continent.class);
			if (!theContinent.commitNeeded) {
				pageContext.getOut().print(theContinent.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Continent theContinent = (Continent)findAncestorWithClass(this, Continent.class);
			return theContinent.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Continent for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Continent theContinent = (Continent)findAncestorWithClass(this, Continent.class);
			theContinent.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for subjectURI tag ");
		}
	}
}

