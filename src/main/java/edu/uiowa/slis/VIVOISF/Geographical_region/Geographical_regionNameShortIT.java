package edu.uiowa.slis.VIVOISF.Geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Geographical_regionNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Geographical_regionNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(Geographical_regionNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Geographical_regionNameShortITIterator theGeographical_region = (Geographical_regionNameShortITIterator)findAncestorWithClass(this, Geographical_regionNameShortITIterator.class);
			pageContext.getOut().print(theGeographical_region.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical_region for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical_region for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

