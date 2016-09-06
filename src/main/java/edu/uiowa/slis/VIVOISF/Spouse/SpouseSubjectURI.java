package edu.uiowa.slis.VIVOISF.Spouse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpouseSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpouseSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(SpouseSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Spouse theSpouse = (Spouse)findAncestorWithClass(this, Spouse.class);
			if (!theSpouse.commitNeeded) {
				pageContext.getOut().print(theSpouse.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Spouse for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Spouse for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Spouse theSpouse = (Spouse)findAncestorWithClass(this, Spouse.class);
			return theSpouse.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Spouse for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Spouse for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Spouse theSpouse = (Spouse)findAncestorWithClass(this, Spouse.class);
			theSpouse.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Spouse for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Spouse for subjectURI tag ");
		}
	}
}

