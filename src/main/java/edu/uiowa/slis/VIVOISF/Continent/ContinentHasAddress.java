package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinentHasAddressIterator theContinentHasAddressIterator = (ContinentHasAddressIterator)findAncestorWithClass(this, ContinentHasAddressIterator.class);
			pageContext.getOut().print(theContinentHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

