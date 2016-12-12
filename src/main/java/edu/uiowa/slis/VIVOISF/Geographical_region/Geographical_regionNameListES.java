package edu.uiowa.slis.VIVOISF.Geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Geographical_regionNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Geographical_regionNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(Geographical_regionNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Geographical_regionNameListESIterator theGeographical_region = (Geographical_regionNameListESIterator)findAncestorWithClass(this, Geographical_regionNameListESIterator.class);
			pageContext.getOut().print(theGeographical_region.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical_region for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical_region for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

