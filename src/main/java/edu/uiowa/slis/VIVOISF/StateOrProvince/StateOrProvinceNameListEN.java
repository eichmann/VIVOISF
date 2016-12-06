package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNameListENIterator theStateOrProvince = (StateOrProvinceNameListENIterator)findAncestorWithClass(this, StateOrProvinceNameListENIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

