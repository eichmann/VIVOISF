package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipGDPTotalInCurrentPricesIterator theEditorship = (EditorshipGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, EditorshipGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theEditorship.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

