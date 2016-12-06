package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNameShortITIterator theStateOrProvince = (StateOrProvinceNameShortITIterator)findAncestorWithClass(this, StateOrProvinceNameShortITIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

