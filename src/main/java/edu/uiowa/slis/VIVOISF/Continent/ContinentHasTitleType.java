package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentHasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinentHasTitleIterator theContinentHasTitleIterator = (ContinentHasTitleIterator)findAncestorWithClass(this, ContinentHasTitleIterator.class);
			pageContext.getOut().print(theContinentHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

