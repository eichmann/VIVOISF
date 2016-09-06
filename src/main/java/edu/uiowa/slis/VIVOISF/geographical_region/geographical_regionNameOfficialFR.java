package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNameOfficialFRIterator thegeographical_region = (geographical_regionNameOfficialFRIterator)findAncestorWithClass(this, geographical_regionNameOfficialFRIterator.class);
			pageContext.getOut().print(thegeographical_region.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

