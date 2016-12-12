package edu.uiowa.slis.VIVOISF.Geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Geographical_regionNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Geographical_regionNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(Geographical_regionNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Geographical_regionNameOfficialITIterator theGeographical_region = (Geographical_regionNameOfficialITIterator)findAncestorWithClass(this, Geographical_regionNameOfficialITIterator.class);
			pageContext.getOut().print(theGeographical_region.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical_region for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical_region for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

