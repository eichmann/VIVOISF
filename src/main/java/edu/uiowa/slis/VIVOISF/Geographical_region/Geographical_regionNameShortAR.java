package edu.uiowa.slis.VIVOISF.Geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Geographical_regionNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Geographical_regionNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(Geographical_regionNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Geographical_regionNameShortARIterator theGeographical_region = (Geographical_regionNameShortARIterator)findAncestorWithClass(this, Geographical_regionNameShortARIterator.class);
			pageContext.getOut().print(theGeographical_region.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical_region for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical_region for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

