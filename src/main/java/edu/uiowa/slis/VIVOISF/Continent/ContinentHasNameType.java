package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinentHasNameIterator theContinentHasNameIterator = (ContinentHasNameIterator)findAncestorWithClass(this, ContinentHasNameIterator.class);
			pageContext.getOut().print(theContinentHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for hasName tag ");
		}
		return SKIP_BODY;
	}
}

