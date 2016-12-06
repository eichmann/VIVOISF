package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNameShortENIterator theStateOrProvince = (StateOrProvinceNameShortENIterator)findAncestorWithClass(this, StateOrProvinceNameShortENIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

