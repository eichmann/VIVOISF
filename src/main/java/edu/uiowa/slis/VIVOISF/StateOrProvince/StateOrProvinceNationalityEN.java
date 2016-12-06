package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceNationalityENIterator theStateOrProvince = (StateOrProvinceNationalityENIterator)findAncestorWithClass(this, StateOrProvinceNationalityENIterator.class);
			pageContext.getOut().print(theStateOrProvince.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

