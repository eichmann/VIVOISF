package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentBFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentBFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentBFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinentBFO_0000051Iterator theContinentBFO_0000051Iterator = (ContinentBFO_0000051Iterator)findAncestorWithClass(this, ContinentBFO_0000051Iterator.class);
			pageContext.getOut().print(theContinentBFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

