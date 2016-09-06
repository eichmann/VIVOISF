package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AbstractVolumeIterator theAbstract = (AbstractVolumeIterator)findAncestorWithClass(this, AbstractVolumeIterator.class);
			pageContext.getOut().print(theAbstract.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for volume tag ");
		}
		return SKIP_BODY;
	}
}

