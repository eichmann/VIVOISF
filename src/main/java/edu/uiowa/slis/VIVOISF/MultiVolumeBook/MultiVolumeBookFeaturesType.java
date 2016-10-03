package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBookFeaturesIterator theMultiVolumeBookFeaturesIterator = (MultiVolumeBookFeaturesIterator)findAncestorWithClass(this, MultiVolumeBookFeaturesIterator.class);
			pageContext.getOut().print(theMultiVolumeBookFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for features tag ");
		}
		return SKIP_BODY;
	}
}

