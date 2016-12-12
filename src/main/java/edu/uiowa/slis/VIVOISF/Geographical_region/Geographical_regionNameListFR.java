package edu.uiowa.slis.VIVOISF.Geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Geographical_regionNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Geographical_regionNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(Geographical_regionNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Geographical_regionNameListFRIterator theGeographical_region = (Geographical_regionNameListFRIterator)findAncestorWithClass(this, Geographical_regionNameListFRIterator.class);
			pageContext.getOut().print(theGeographical_region.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical_region for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical_region for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

