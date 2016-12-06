package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentRO_0002234 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentRO_0002234 currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentRO_0002234.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinentRO_0002234Iterator theContinentRO_0002234Iterator = (ContinentRO_0002234Iterator)findAncestorWithClass(this, ContinentRO_0002234Iterator.class);
			pageContext.getOut().print(theContinentRO_0002234Iterator.getRO_0002234());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

