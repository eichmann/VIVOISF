package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationARG_2000029 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationARG_2000029 currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationARG_2000029.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationARG_2000029Iterator theLocationARG_2000029Iterator = (LocationARG_2000029Iterator)findAncestorWithClass(this, LocationARG_2000029Iterator.class);
			pageContext.getOut().print(theLocationARG_2000029Iterator.getARG_2000029());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for ARG_2000029 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for ARG_2000029 tag ");
		}
		return SKIP_BODY;
	}
}

