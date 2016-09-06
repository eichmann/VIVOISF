package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNameOfficialITIterator thegeographical_region = (geographical_regionNameOfficialITIterator)findAncestorWithClass(this, geographical_regionNameOfficialITIterator.class);
			pageContext.getOut().print(thegeographical_region.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

