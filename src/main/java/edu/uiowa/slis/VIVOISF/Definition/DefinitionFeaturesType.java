package edu.uiowa.slis.VIVOISF.Definition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DefinitionFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DefinitionFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(DefinitionFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DefinitionFeaturesIterator theDefinitionFeaturesIterator = (DefinitionFeaturesIterator)findAncestorWithClass(this, DefinitionFeaturesIterator.class);
			pageContext.getOut().print(theDefinitionFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Definition for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Definition for features tag ");
		}
		return SKIP_BODY;
	}
}

