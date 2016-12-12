package edu.uiowa.slis.VIVOISF.Geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Geographical_regionNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Geographical_regionNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(Geographical_regionNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Geographical_regionNameOfficialARIterator theGeographical_region = (Geographical_regionNameOfficialARIterator)findAncestorWithClass(this, Geographical_regionNameOfficialARIterator.class);
			pageContext.getOut().print(theGeographical_region.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical_region for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical_region for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

