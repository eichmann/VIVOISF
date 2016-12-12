package edu.uiowa.slis.VIVOISF.Geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Geographical_regionNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Geographical_regionNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(Geographical_regionNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Geographical_regionNameListARIterator theGeographical_region = (Geographical_regionNameListARIterator)findAncestorWithClass(this, Geographical_regionNameListARIterator.class);
			pageContext.getOut().print(theGeographical_region.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical_region for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical_region for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

