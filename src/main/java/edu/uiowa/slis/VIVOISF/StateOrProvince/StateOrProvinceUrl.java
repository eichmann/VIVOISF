package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceUrlIterator theStateOrProvince = (StateOrProvinceUrlIterator)findAncestorWithClass(this, StateOrProvinceUrlIterator.class);
			pageContext.getOut().print(theStateOrProvince.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for url tag ");
		}
		return SKIP_BODY;
	}
}

