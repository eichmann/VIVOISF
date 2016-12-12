package edu.uiowa.slis.VIVOISF.Geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Geographical_regionNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Geographical_regionNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(Geographical_regionNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Geographical_regionNameOfficialZHIterator theGeographical_region = (Geographical_regionNameOfficialZHIterator)findAncestorWithClass(this, Geographical_regionNameOfficialZHIterator.class);
			pageContext.getOut().print(theGeographical_region.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical_region for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical_region for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

