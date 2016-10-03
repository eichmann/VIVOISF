package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(MapDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapDistributorIterator theMapDistributorIterator = (MapDistributorIterator)findAncestorWithClass(this, MapDistributorIterator.class);
			pageContext.getOut().print(theMapDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for distributor tag ");
		}
		return SKIP_BODY;
	}
}

