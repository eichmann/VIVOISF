package edu.uiowa.slis.VIVOISF.Geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Geographical_regionNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Geographical_regionNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(Geographical_regionNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Geographical_regionNameListZHIterator theGeographical_region = (Geographical_regionNameListZHIterator)findAncestorWithClass(this, Geographical_regionNameListZHIterator.class);
			pageContext.getOut().print(theGeographical_region.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical_region for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical_region for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

