package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNameCurrencyENIterator theStateOrProvince = (StateOrProvinceNameCurrencyENIterator)findAncestorWithClass(this, StateOrProvinceNameCurrencyENIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

