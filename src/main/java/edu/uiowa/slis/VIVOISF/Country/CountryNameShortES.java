package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNameShortESIterator theCountry = (CountryNameShortESIterator)findAncestorWithClass(this, CountryNameShortESIterator.class);
			pageContext.getOut().print(theCountry.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

