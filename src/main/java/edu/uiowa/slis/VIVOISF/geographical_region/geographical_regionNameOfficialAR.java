package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNameOfficialARIterator thegeographical_region = (geographical_regionNameOfficialARIterator)findAncestorWithClass(this, geographical_regionNameOfficialARIterator.class);
			pageContext.getOut().print(thegeographical_region.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

