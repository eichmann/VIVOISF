package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNameListITIterator theStateOrProvince = (StateOrProvinceNameListITIterator)findAncestorWithClass(this, StateOrProvinceNameListITIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

