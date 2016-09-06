package edu.uiowa.slis.VIVOISF.GlobalCitationCount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GlobalCitationCountSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GlobalCitationCountSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(GlobalCitationCountSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GlobalCitationCount theGlobalCitationCount = (GlobalCitationCount)findAncestorWithClass(this, GlobalCitationCount.class);
			if (!theGlobalCitationCount.commitNeeded) {
				pageContext.getOut().print(theGlobalCitationCount.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GlobalCitationCount for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing GlobalCitationCount for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			GlobalCitationCount theGlobalCitationCount = (GlobalCitationCount)findAncestorWithClass(this, GlobalCitationCount.class);
			return theGlobalCitationCount.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing GlobalCitationCount for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing GlobalCitationCount for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			GlobalCitationCount theGlobalCitationCount = (GlobalCitationCount)findAncestorWithClass(this, GlobalCitationCount.class);
			theGlobalCitationCount.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing GlobalCitationCount for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing GlobalCitationCount for subjectURI tag ");
		}
	}
}

