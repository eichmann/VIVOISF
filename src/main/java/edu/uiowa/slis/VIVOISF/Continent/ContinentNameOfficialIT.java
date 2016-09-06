package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNameOfficialITIterator theContinent = (ContinentNameOfficialITIterator)findAncestorWithClass(this, ContinentNameOfficialITIterator.class);
			pageContext.getOut().print(theContinent.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

