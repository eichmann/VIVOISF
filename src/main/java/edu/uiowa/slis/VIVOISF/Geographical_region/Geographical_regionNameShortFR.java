package edu.uiowa.slis.VIVOISF.Geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Geographical_regionNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Geographical_regionNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(Geographical_regionNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Geographical_regionNameShortFRIterator theGeographical_region = (Geographical_regionNameShortFRIterator)findAncestorWithClass(this, Geographical_regionNameShortFRIterator.class);
			pageContext.getOut().print(theGeographical_region.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical_region for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical_region for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

