package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNameShortESIterator theStateOrProvince = (StateOrProvinceNameShortESIterator)findAncestorWithClass(this, StateOrProvinceNameShortESIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

