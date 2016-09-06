package edu.uiowa.slis.VIVOISF.PopulatedPlace;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PopulatedPlaceRO_0000053 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PopulatedPlaceRO_0000053 currentInstance = null;
	private static final Log log = LogFactory.getLog(PopulatedPlaceRO_0000053.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PopulatedPlaceRO_0000053Iterator thePopulatedPlaceRO_0000053Iterator = (PopulatedPlaceRO_0000053Iterator)findAncestorWithClass(this, PopulatedPlaceRO_0000053Iterator.class);
			pageContext.getOut().print(thePopulatedPlaceRO_0000053Iterator.getRO_0000053());
		} catch (Exception e) {
			log.error("Can't find enclosing PopulatedPlace for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PopulatedPlace for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

