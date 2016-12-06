package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNameCurrencyESIterator theStateOrProvince = (StateOrProvinceNameCurrencyESIterator)findAncestorWithClass(this, StateOrProvinceNameCurrencyESIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

