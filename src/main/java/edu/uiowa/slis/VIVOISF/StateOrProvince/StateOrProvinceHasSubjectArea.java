package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceHasSubjectArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceHasSubjectArea currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceHasSubjectArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceHasSubjectAreaIterator theStateOrProvinceHasSubjectAreaIterator = (StateOrProvinceHasSubjectAreaIterator)findAncestorWithClass(this, StateOrProvinceHasSubjectAreaIterator.class);
			pageContext.getOut().print(theStateOrProvinceHasSubjectAreaIterator.getHasSubjectArea());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

