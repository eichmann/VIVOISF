package edu.uiowa.slis.VIVOISF.Geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Geographical_regionNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Geographical_regionNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(Geographical_regionNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Geographical_regionNameOfficialFRIterator theGeographical_region = (Geographical_regionNameOfficialFRIterator)findAncestorWithClass(this, Geographical_regionNameOfficialFRIterator.class);
			pageContext.getOut().print(theGeographical_region.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical_region for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical_region for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

