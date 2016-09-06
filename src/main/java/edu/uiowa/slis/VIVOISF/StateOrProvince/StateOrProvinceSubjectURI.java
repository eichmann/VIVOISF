package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvince theStateOrProvince = (StateOrProvince)findAncestorWithClass(this, StateOrProvince.class);
			if (!theStateOrProvince.commitNeeded) {
				pageContext.getOut().print(theStateOrProvince.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			StateOrProvince theStateOrProvince = (StateOrProvince)findAncestorWithClass(this, StateOrProvince.class);
			return theStateOrProvince.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing StateOrProvince for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			StateOrProvince theStateOrProvince = (StateOrProvince)findAncestorWithClass(this, StateOrProvince.class);
			theStateOrProvince.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for subjectURI tag ");
		}
	}
}

