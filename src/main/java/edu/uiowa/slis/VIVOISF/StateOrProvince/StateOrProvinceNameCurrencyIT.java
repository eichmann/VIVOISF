package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNameCurrencyITIterator theStateOrProvince = (StateOrProvinceNameCurrencyITIterator)findAncestorWithClass(this, StateOrProvinceNameCurrencyITIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

