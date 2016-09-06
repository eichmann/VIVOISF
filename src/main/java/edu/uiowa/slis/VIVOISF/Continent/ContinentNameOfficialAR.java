package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNameOfficialARIterator theContinent = (ContinentNameOfficialARIterator)findAncestorWithClass(this, ContinentNameOfficialARIterator.class);
			pageContext.getOut().print(theContinent.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

