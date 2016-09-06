package edu.uiowa.slis.VIVOISF.County;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountySubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CountySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			County theCounty = (County)findAncestorWithClass(this, County.class);
			if (!theCounty.commitNeeded) {
				pageContext.getOut().print(theCounty.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing County for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing County for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			County theCounty = (County)findAncestorWithClass(this, County.class);
			return theCounty.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing County for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing County for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			County theCounty = (County)findAncestorWithClass(this, County.class);
			theCounty.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing County for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing County for subjectURI tag ");
		}
	}
}

