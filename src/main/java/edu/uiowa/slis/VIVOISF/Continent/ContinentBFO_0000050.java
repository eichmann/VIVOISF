package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentBFO_0000050 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentBFO_0000050 currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentBFO_0000050.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinentBFO_0000050Iterator theContinentBFO_0000050Iterator = (ContinentBFO_0000050Iterator)findAncestorWithClass(this, ContinentBFO_0000050Iterator.class);
			pageContext.getOut().print(theContinentBFO_0000050Iterator.getBFO_0000050());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

