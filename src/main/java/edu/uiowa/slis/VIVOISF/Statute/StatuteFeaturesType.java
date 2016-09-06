package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StatuteFeaturesIterator theStatuteFeaturesIterator = (StatuteFeaturesIterator)findAncestorWithClass(this, StatuteFeaturesIterator.class);
			pageContext.getOut().print(theStatuteFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for features tag ");
		}
		return SKIP_BODY;
	}
}

