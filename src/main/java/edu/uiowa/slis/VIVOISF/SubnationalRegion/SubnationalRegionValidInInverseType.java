package edu.uiowa.slis.VIVOISF.SubnationalRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SubnationalRegionValidInInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SubnationalRegionValidInInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(SubnationalRegionValidInInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SubnationalRegionValidInInverseIterator theSubnationalRegionValidInInverseIterator = (SubnationalRegionValidInInverseIterator)findAncestorWithClass(this, SubnationalRegionValidInInverseIterator.class);
			pageContext.getOut().print(theSubnationalRegionValidInInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing SubnationalRegion for validIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing SubnationalRegion for validIn tag ");
		}
		return SKIP_BODY;
	}
}

