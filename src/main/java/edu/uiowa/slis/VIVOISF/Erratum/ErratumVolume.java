package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ErratumVolumeIterator theErratum = (ErratumVolumeIterator)findAncestorWithClass(this, ErratumVolumeIterator.class);
			pageContext.getOut().print(theErratum.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for volume tag ");
		}
		return SKIP_BODY;
	}
}

